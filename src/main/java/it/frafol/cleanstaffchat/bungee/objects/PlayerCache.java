package it.frafol.cleanstaffchat.bungee.objects;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UtilityClass
public class PlayerCache {

    @Getter
    private final HashSet<UUID> toggled = new HashSet<>();

    @Getter
    private final HashSet<UUID> toggled_2 = new HashSet<>();

    @Getter
    private final HashSet<UUID> toggled_admin = new HashSet<>();

    @Getter
    private final HashSet<UUID> toggled_2_admin = new HashSet<>();

    @Getter
    private final HashSet<UUID> toggled_donor = new HashSet<>();

    @Getter
    private final HashSet<UUID> toggled_2_donor = new HashSet<>();

    @Getter
    private final HashSet<UUID> afk = new HashSet<>();

    @Getter
    private final HashSet<UUID> cooldown = new HashSet<>();

    @Getter
    private final HashSet<String> muted = new HashSet<>();

    @Getter
    private final HashSet<String> muted_admin = new HashSet<>();

    @Getter
    private final HashSet<String> muted_donor = new HashSet<>();

    @Getter
    private final HashSet<String> cooldown_discord = new HashSet<>();

    @Getter
    private final HashSet<String> mutedservers = new HashSet<>();

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
        String hex = convertHexColors(string);
        return hex.replace("&", "§");
    }

    public static String convertHexColors(String str) {
        Pattern unicode = Pattern.compile("\\\\u\\+[a-fA-F0-9]{4}");
        Matcher match = unicode.matcher(str);
        while (match.find()) {
            String code = str.substring(match.start(),match.end());
            str = str.replace(code,Character.toString((char) Integer.parseInt(code.replace("\\u+",""),16)));
            match = unicode.matcher(str);
        }
        Pattern pattern = Pattern.compile("&#[a-fA-F0-9]{6}");
        match = pattern.matcher(str);
        while (match.find()) {
            String color = str.substring(match.start(),match.end());
            str = str.replace(color,ChatColor.of(color.replace("&","")) + "");
            match = pattern.matcher(str);
        }
        Pattern pattern2 = Pattern.compile("#[a-fA-F0-9]{6}");
        match = pattern2.matcher(str);
        while (match.find()) {
            String color = str.substring(match.start(),match.end());
            str = str.replace(color,ChatColor.of(color) + "");
            match = pattern2.matcher(str);
        }
        Pattern pattern3 = Pattern.compile("<#[0-9a-fA-F]{6}>");
        match = pattern3.matcher(str);
        while (match.find()) {
            String color = str.substring(match.start(),match.end());
            str = str.replace(color,ChatColor.of(color.replace("&","")) + "");
            match = pattern.matcher(str);
        }
        return ChatColor.translateAlternateColorCodes('&',str);
    }

    @SuppressWarnings("UnstableApiUsage")
    public void sendChannelMessage(ProxiedPlayer player, boolean cancel) {

        final ByteArrayDataOutput buf = ByteStreams.newDataOutput();

        buf.writeUTF(String.valueOf(cancel));
        buf.writeUTF(player.getName());

        if (player.getServer() == null) {
            return;
        }

        player.getServer().sendData("cleansc:cancel", buf.toByteArray());
    }
}
