# Unstable Death Ban Mod (Fabric)

This mod is inspired from the unstable death ban mechanics like death messages + bans, and wither sounds upon death in a radius (radius can be changed or toggled)

## Setup

For setup instructions, please see the [Fabric Documentation page](https://docs.fabricmc.net/develop/getting-started/creating-a-project#setting-up) related to the IDE that you are using.

## Known issues

### Unbans

The mod uses the defaul minecraft ban command, hence to they go into the default banlist and can be unbanned using /pardon from console or in game.
However, since the ban command is ran when a deatheven has happened, the player does drop their loot, but respawns at their death location. So, perchance, they fall into the void, get death-banned, and unbanned by an admin or plugin. They will respawn right back into the void, and need to be teleported to surface to be saved (Fix WIP).

## Roadmap

### Config

#### Bans vs IP Bans

A configurable option to toggle between Ban, IP ban, or both

#### Affected radius

Option to tweak or disable the radius in which people see join, leave, death messages and the death wither sound

#### Wither sound toggle

Like the name says, toggleable wither sound

#### Custom death messages + ban messages

Can be tweaked in source code but I want to add a config option for that to tweak leave, join, death, and ban messages if people dont want the default "Player was slain by Player2 \n Player left the game"

### Blacklist

Add people in this list so that they never get deathbanned and rather have normal vanilla death behaviour

### Respawn location (bugfix)

I dont really have many plans nor any idea how to fix it honestly but if I happen to get the time, ill surely implement it
