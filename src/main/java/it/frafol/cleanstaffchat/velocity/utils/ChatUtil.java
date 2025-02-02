package it.frafol.cleanstaffchat.velocity.utils;

import it.frafol.cleanstaffchat.velocity.CleanStaffChat;
import it.frafol.cleanstaffchat.velocity.enums.VelocityMessages;
import it.frafol.cleanstaffchat.velocity.objects.Placeholder;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UtilityClass
public class ChatUtil {
    private static final CleanStaffChat instance = CleanStaffChat.getInstance();

    public String getString(@NotNull VelocityMessages velocityMessages) {
        return instance.getMessagesTextFile().getConfig().getString(velocityMessages.getPath());
    }

    public String getString(VelocityMessages velocityMessages, Placeholder... placeholders) {
        return applyPlaceholder(getString(velocityMessages), placeholders);
    }

    public String getFormattedString(VelocityMessages velocityMessages, Placeholder... placeholders) {
        return color(getString(velocityMessages, placeholders));
    }

    public String applyPlaceholder(String s, Placeholder @NotNull ... placeholders) {
        for (Placeholder placeholder : placeholders) {
            s = s.replace(placeholder.getKey(), placeholder.getValue());
        }

        return s;
    }

    public String color(@NotNull String s) {
        return s.replace("&", "§");
    }

    public boolean hasColorCodes(@NotNull String message) {
        return message.contains("&0") ||
                message.contains("&1") ||
                message.contains("&2") ||
                message.contains("&3") ||
                message.contains("&4") ||
                message.contains("&5") ||
                message.contains("&6") ||
                message.contains("&7") ||
                message.contains("&8") ||
                message.contains("&9") ||
                message.contains("&a") ||
                message.contains("&b") ||
                message.contains("&c") ||
                message.contains("&d") ||
                message.contains("&e") ||
                message.contains("&f") ||
                message.contains("&k") ||
                message.contains("&l") ||
                message.contains("&m") ||
                message.contains("&n") ||
                message.contains("&o") ||
                message.contains("&r");

    }

    public String translateHex(String string) {
        return convertHexColors(string);
    }

    private String convertHexColors(String message) {

        if (!containsHexColor(message)) {
            return message.replace('&', '§');
        }

        Pattern pattern = Pattern.compile("#[a-fA-F0-9]{6}");
        Matcher matcher = pattern.matcher(message);
        while (matcher.find()) {
            String hexCode = message.substring(matcher.start(), matcher.end());
            String replaceSharp = hexCode.replace('#', 'x');

            char[] ch = replaceSharp.toCharArray();
            StringBuilder builder = new StringBuilder();
            for (char c : ch) {
                builder.append("&").append(c);
            }

            message = message.replace(hexCode, builder.toString());
            matcher = pattern.matcher(message);
        }
        pattern = Pattern.compile("&#[a-fA-F0-9]{6}");
        matcher = pattern.matcher(message);
        while (matcher.find()) {
            String hexCode = message.substring(matcher.start(), matcher.end());
            String replaceSharp = hexCode.replace('#', 'x');

            char[] ch = replaceSharp.toCharArray();
            StringBuilder builder = new StringBuilder();
            for (char c : ch) {
                builder.append("&").append(c);
            }

            message = message.replace(hexCode, builder.toString());
            matcher = pattern.matcher(message);
        }
        pattern = Pattern.compile("<#[a-fA-F0-9]]{6}>");
        matcher = pattern.matcher(message);
        while (matcher.find()) {
            String hexCode = message.substring(matcher.start(), matcher.end());
            String replaceSharp = hexCode.replace('#', 'x');

            char[] ch = replaceSharp.toCharArray();
            StringBuilder builder = new StringBuilder();
            for (char c : ch) {
                builder.append("&").append(c);
            }

            message = message.replace(hexCode, builder.toString());
            matcher = pattern.matcher(message);
        }
        return message;
    }

    private boolean containsHexColor(String message) {
        String[] hexColorPattern = new String[]{"#[a-fA-F0-9]{6}", "&#[a-fA-F0-9]{6}", "<#[a-fA-F0-9]]{6}>"};
        for (String pattern : hexColorPattern) {
            if (Pattern.compile(pattern).matcher(message).find()) {
                return true;
            }
        }
        return false;
    }
}
