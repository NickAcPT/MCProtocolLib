package com.github.steveice10.mc.protocol;

import com.github.steveice10.mc.auth.data.GameProfile;
import com.github.steveice10.mc.auth.service.SessionService;

/**
 * Class containing various constants for Minecraft sessions.
 */
public final class MinecraftConstants {
    // General Constants

    /**
     * Current supported game version.
     */
    public static final String GAME_VERSION = "1.16.2";

    /**
     * Current supported protocol version.
     */
    public static final int PROTOCOL_VERSION = 751;

    // General Key Constants

    /**
     * Session flag where the user {@link GameProfile} is stored.
     */
    public static final String PROFILE_KEY = "profile";

    /**
     * Session flag for providing a custom {@link SessionService} instance.
     */
    public static final String SESSION_SERVICE_KEY = "session-service";

    // Client Key Constants

    /**
     * Session flag where the user's access token is stored. Client only.
     */
    public static final String ACCESS_TOKEN_KEY = "access-token";

    /**
     * Session flag for providing a custom server info response handler. Client only.
     */
    public static final String SERVER_INFO_HANDLER_KEY = "server-info-handler";

    /**
     * Session flag for providing a custom ping time response handler. Client only.
     */
    public static final String SERVER_PING_TIME_HANDLER_KEY = "server-ping-time-handler";

    // Server Key Constants

    /**
     * Session flag for determining whether to verify users. Server only.
     */
    public static final String VERIFY_USERS_KEY = "verify-users";

    /**
     * Session flag for providing a custom server info response builder. Server only.
     */
    public static final String SERVER_INFO_BUILDER_KEY = "info-builder";

    /**
     * Session flag for providing a custom server login handler. Server only.
     */
    public static final String SERVER_LOGIN_HANDLER_KEY = "login-handler";

    /**
     * Session flag for storing the current ping time. Server only.
     */
    public static final String PING_KEY = "ping";

    /**
     * Session flag for determining the packet compression threshold. Server only.
     */
    public static final String SERVER_COMPRESSION_THRESHOLD = "compression-threshold";

    private MinecraftConstants() {
    }
}
