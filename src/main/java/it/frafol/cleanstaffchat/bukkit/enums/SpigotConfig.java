package it.frafol.cleanstaffchat.bukkit.enums;

import it.frafol.cleanstaffchat.bukkit.CleanStaffChat;

public enum SpigotConfig {

    PLAYER_ONLY("messages.console"),

    NO_PERMISSION("messages.no_permission"),

    PREFIX("messages.staffchat.prefix"),
    ADMINPREFIX("messages.adminchat.prefix"),
    DONORPREFIX("messages.donorchat.prefix"),

    DONORCHAT_COOLDOWN_MESSAGE("messages.donorchat.cooldown"),

    STAFFCHAT_FORMAT("messages.staffchat.staffchat_format"),
    ADMINCHAT_FORMAT("messages.adminchat.adminchat_format"),
    DONORCHAT_FORMAT("messages.donorchat.donorchat_format"),

    STAFFCHAT_MUTED_ERROR("messages.chat_muted_error"),
    ADMINCHAT_MUTED_ERROR("messages.chat_muted_error"),
    DONORCHAT_MUTED_ERROR("messages.chat_muted_error"),

    STAFFCHAT_JOIN_LEAVE_ALL("settings.staffchat.staff_join_all_players"),
    STAFFCHAT_QUIT_ALL("settings.staffchat.staff_quit_all_players"),

    STAFFCHAT_AFK_MODULE("modules.staffchat_afk_module"),
    STAFFCHAT_AFK_ON("messages.staffchat.staff_afk_on_message_format"),
    STAFFCHAT_AFK_OFF("messages.staffchat.staff_afk_off_message_format"),
    STAFFCHAT_NO_AFK_ONCHANGE_SERVER("settings.staffchat.staff_disable_afk_on_move"),
    STAFFCHAT_AFK_PERMISSION("settings.staffchat.staffchat_afk_permission"),

    STAFFCHAT_FORMAT_DISCORD("messages.staffchat.discord.staffchat_to_discord_format"),
    DONORCHAT_FORMAT_DISCORD("messages.donorchat.discord.donorchat_to_discord_format"),
    ADMINCHAT_FORMAT_DISCORD("messages.adminchat.discord.adminchat_to_discord_format"),

    STAFF_JOIN_MESSAGE("settings.staffchat.staff_join_message"),
    STAFF_QUIT_MESSAGE("settings.staffchat.staff_quit_message"),
    STAFF_DISCORD_JOIN_MESSAGE_FORMAT("messages.staffchat.discord.discord_join_message_format"),
    STAFF_DISCORD_QUIT_MESSAGE_FORMAT("messages.staffchat.discord.discord_quit_message_format"),
    STAFF_JOIN_MESSAGE_FORMAT("messages.staffchat.staff_join_message_format"),
    STAFF_QUIT_MESSAGE_FORMAT("messages.staffchat.staff_quit_message_format"),
    COOLDOWN_BYPASS_DISCORD("settings.donorchat.donorchat_discord_cooldown_bypass"),
    COOLDOWN_BYPASS_PERMISSION("settings.donorchat.donorchat_cooldown_bypass_permission"),
    JOIN_LEAVE_DISCORD_MODULE("modules.staffchat_discord_join_leave_module"),

    STAFFCHAT_USE_PERMISSION("settings.staffchat.staffchat_use_permission"),
    ADMINCHAT_USE_PERMISSION("settings.adminchat.adminchat_use_permission"),
    DONORCHAT_USE_PERMISSION("settings.donorchat.donorchat_use_permission"),

    PREVENT_COLOR_CODES("settings.prevent_color_codes"),
    COLOR_CODES("messages.deny_color_codes"),
    DONOR_TIMER("settings.donorchat.cooldown"),

    CONSOLE_PREFIX("settings.console_name"),

    ARGUMENTS("messages.staffchat.arguments"),
    ADMINARGUMENTS("messages.adminchat.arguments"),
    DONORARGUMENTS("messages.donorchat.arguments"),

    STAFFCHAT_TALK_MODULE("modules.staffchat_talk_module"),
    ADMINCHAT_TALK_MODULE("modules.adminchat_talk_module"),
    DONORCHAT_TALK_MODULE("modules.donorchat_talk_module"),
    STAFFCHAT_TALK_ENABLED("messages.staffchat.staffchat_talk_enabled"),
    STAFFCHAT_TALK_DISABLED("messages.staffchat.staffchat_talk_disabled"),
    ADMINCHAT_TALK_ENABLED("messages.adminchat.adminchat_talk_enabled"),
    ADMINCHAT_TALK_DISABLED("messages.adminchat.adminchat_talk_disabled"),
    DONORCHAT_TALK_ENABLED("messages.donorchat.donorchat_talk_enabled"),
    DONORCHAT_TALK_DISABLED("messages.donorchat.donorchat_talk_disabled"),

    STAFFCHAT_MUTE_MODULE("modules.staffchat_mute_module"),
    ADMINCHAT_MUTE_MODULE("modules.adminchat_mute_module"),
    DONORCHAT_MUTE_MODULE("modules.donorchat_mute_module"),
    STAFFCHAT_MUTED("messages.staffchat.staffchat_muted"),
    STAFFCHAT_UNMUTED("messages.staffchat.staffchat_unmuted"),
    ADMINCHAT_MUTED("messages.adminchat.adminchat_muted"),
    ADMINCHAT_UNMUTED("messages.adminchat.adminchat_unmuted"),
    DONORCHAT_MUTED("messages.donorchat.donorchat_muted"),
    DONORCHAT_UNMUTED("messages.donorchat.donorchat_unmuted"),
    STAFFCHAT_MUTE_PERMISSION("settings.staffchat.staffchat_mute_permission"),
    ADMINCHAT_MUTE_PERMISSION("settings.adminchat.adminchat_mute_permission"),
    DONORCHAT_MUTE_PERMISSION("settings.donorchat.donorchat_mute_permission"),

    STAFFCHAT_TOGGLE_MODULE("modules.staffchat_toggle_module"),
    ADMINCHAT_TOGGLE_MODULE("modules.adminchat_toggle_module"),
    DONORCHAT_TOGGLE_MODULE("modules.donorchat_toggle_module"),
    STAFFCHAT_TOGGLED_ON("messages.staffchat.staffchat_toggled_on"),
    STAFFCHAT_TOGGLED_OFF("messages.staffchat.staffchat_toggled_off"),
    ADMINCHAT_TOGGLED_ON("messages.adminchat.adminchat_toggled_on"),
    ADMINCHAT_TOGGLED_OFF("messages.adminchat.adminchat_toggled_off"),
    DONORCHAT_TOGGLED_ON("messages.donorchat.donorchat_toggled_on"),
    DONORCHAT_TOGGLED_OFF("messages.donorchat.donorchat_toggled_off"),

    STAFFCHAT_RELOAD_PERMISSION("settings.reload_permission"),
    RELOADED("messages.reloaded"),

    CONSOLE_CAN_TALK("settings.console_staffchat"),
    STAFFCHAT_TOGGLE_PERMISSION("settings.staffchat.staffchat_toggle_permission"),
    ADMINCHAT_TOGGLE_PERMISSION("settings.adminchat.adminchat_toggle_permission"),
    DONORCHAT_TOGGLE_PERMISSION("settings.donorchat.donorchat_toggle_permission"),

    MODULE_DISABLED("messages.module_disabled"),

    STATS("modules.stats"),

    UPDATE_CHECK("modules.update_check"),

    STAFFCHAT_DISCORD_MODULE("modules.staffchat_discord_module"),
    ADMINCHAT_DISCORD_MODULE("modules.adminchat_discord_module"),
    DONORCHAT_DISCORD_MODULE("modules.donorchat_discord_module"),
    DISCORD_ENABLED("discord.enabled"),
    DISCORD_TOKEN("discord.token"),
    DISCORD_ACTIVITY_TYPE("discord.activity_type"),
    STAFFCHAT_MUTED_ERROR_DISCORD("messages.chat_muted_error_discord"),
    DISCORD_ACTIVITY("discord.activity"),
    DISCORD_STAFF_FORMAT("messages.staffchat.discord.staffchat_discord_format"),
    DISCORD_DONOR_FORMAT("messages.donorchat.discord.donorchat_discord_format"),
    DISCORD_ADMIN_FORMAT("messages.adminchat.discord.adminchat_discord_format"),
    STAFF_CHANNEL_ID("discord.staffchat_channel_id"),
    DONOR_CHANNEL_ID("discord.donorchat_channel_id"),
    ADMIN_CHANNEL_ID("discord.adminchat_channel_id"),

    DONORCHAT_COOLDOWN_ERROR_DISCORD("messages.donorchat.discord.discord_cooldown_message"),

    STAFFCHAT("settings.use_staffchat"),
    ADMINCHAT("settings.use_adminchat"),
    DONORCHAT("settings.use_donorchat");

    private final String path;
    public static final CleanStaffChat instance = CleanStaffChat.getInstance();

    SpigotConfig(String path) {
        this.path = path;
    }

    public <T> T get(Class<T> clazz) {
        return clazz.cast(instance.getConfigTextFile().get(path));
    }

    public String color() {
        return get(String.class).replace("&", "§");
    }
}
