# FastMinecart Plugin

FastMinecart is a simple Minecraft plugin that increases the speed of minecarts when a player is inside, making them travel three times faster than usual.

## Features
- Automatically triples the speed of minecarts when a player is inside.
- Works seamlessly with existing minecart mechanics.
- Lightweight and optimized for performance.

## Installation
1. Download the latest version of `FastMinecart.jar` from the releases.
2. Place the `.jar` file into your server's `plugins/` folder.
3. Restart your server.
4. Enjoy faster minecart rides!

## Requirements
- Minecraft Server running Paper/Spigot (1.20 or higher).
- Java 17+.

## Configuration
Currently, this plugin does not require any configuration.

## Commands & Permissions
This plugin does not have commands or permissions; it works automatically.

## How It Works
When a player enters a minecart, the plugin detects it and instantly increases its velocity by a factor of 3.

## Development
### Building with Maven
To build the plugin from the source, navigate to the project root and run:
```sh
mvn clean package
```
The compiled `.jar` file will be located in the `target/` directory.

## License
This project is open-source and available under the MIT License.
