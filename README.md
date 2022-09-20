# The Agony Forge

**A modern, web based MUD.**

![Build Status](https://codebuild.us-west-2.amazonaws.com/badges?uuid=eyJlbmNyeXB0ZWREYXRhIjoieVlBaTI5bFducnovY2YrQ3RSVEV4Q3ZwRG02VXhnbGlscEI1dTNIaDdmQk9weFlxZTN0MWJ6b21tMXVmZDNYVjQ2WkRpMTBZV3ZQckFoeDVuVm1DU1NVPSIsIml2UGFyYW1ldGVyU3BlYyI6Ijd1RnpYaGNsRjZhL0xMWXoiLCJtYXRlcmlhbFNldFNlcmlhbCI6MX0%3D&branch=master)
[![Dependabot Status](https://api.dependabot.com/badges/status?host=github&repo=scionaltera/agony-forge)](https://dependabot.com)
[![Uptime Status](https://img.shields.io/uptimerobot/ratio/7/m780157574-3e51f055cd847dfba406172d.svg)](https://uptime.agonyforge.com)  
[![Website Link](https://img.shields.io/badge/url-site-informational)](https://agonyforge.com)
[![Game Link](https://img.shields.io/badge/url-game-informational)](https://play.agonyforge.com)

The Agony Forge is a modern, web based MUD core. It is [MIT licensed](https://raw.githubusercontent.com/scionaltera/agony-forge/master/LICENSE) so you can use it for anything you want, free or commercial.

![Screen Shot](https://agonyforge.com/agony-forge-screen.png)

# Agony Forge
Agony Forge is a web based MUD codebase written in Java using Spring Boot.

# Current Status
At the moment Agony Forge is not yet a complete MUD engine. It is a new take on an older project which needs quite a bit of new groundwork and planning before it will be usable. Watch this space!

# Versioning
The Agony Forge is currently in v0.y.z versions, which means anything is fair game for development. If you're following the pull requests you can expect to see massive refactors, breaking changes in the database update scripts and full database wipes as fairly routine events. The codebase is in very early stages right now and I need the flexibility to adjust as I go. The version numbers are not incremented according to any rigid formula right now. I just increment when I feel like it's appropriate.

When it's time I'll move to v1.0.0 and adopt a more formal vx.y.z versioning scheme:

* Breaks in backwards compatibility (e.g. changes that would require wiping the database) will increment the x, or "major" version.
* Substantial refactors or rewrites that visibly and significantly change the game can also increment the x, or "major" version. There is no expectation that a v3.y.z and a v2.y.z version of the game would be at all compatible or even similar to one another, although I will always try to provide a smooth upgrade path from one major version (greater than zero) to the next.
* Each quarter will roll the y, or "minor", version number and create a release bundle with all the regular enhancements and bug fixes from throughout the prior quarter. Individual pull requests need not increment any version number.
* Critical bug fixes (e.g. security flaws or exploitable bugs) that cannot simply wait for the next release will increment the z number.
