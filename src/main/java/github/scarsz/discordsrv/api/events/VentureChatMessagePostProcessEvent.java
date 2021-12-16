/*-
 * LICENSE
 * DiscordSRV
 * -------------
 * Copyright (C) 2016 - 2021 Austin "Scarsz" Shapiro
 * -------------
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * END
 */

package github.scarsz.discordsrv.api.events;

import org.bukkit.event.Cancellable;

import lombok.Getter;
import lombok.Setter;
import mineverse.Aust1n46.chat.api.events.VentureChatEvent;

/**
 * <p>Called after DiscordSRV has processed a VentureChat message but before being sent to Discord.
 * Modification is allow and will effect the message sent to Discord.</p>
 */
public class VentureChatMessagePostProcessEvent extends VentureChatMessageEvent implements Cancellable {

    @Getter @Setter private boolean cancelled;

    @Getter @Setter private String channel;
    @Getter @Setter private String processedMessage;

    public VentureChatMessagePostProcessEvent(String channel, String processedMessage, VentureChatEvent ventureChatEvent, boolean cancelled) {
        super(ventureChatEvent);
        this.channel = channel;
        this.processedMessage = processedMessage;
        setCancelled(cancelled);
    }

}
