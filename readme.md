# Sneaky Shuffleboard GUI

FRC team  Sneaky Snakes' Shuffleboard  for 2020 INFINITE RECHARGE.

# Cloning this repository 

First, you need to download and install Git Bash into your device.
You can download Git Bash from here : [Git Bash]([https://git-scm.com/downloads](https://git-scm.com/downloads))


After downloading and installing the Git Bash into your device, you need to open [this repository]([https://github.com/sneakysnakesfrc/sneaky-shuffleboard-2020](https://github.com/sneakysnakesfrc/sneaky-shuffleboard-2020)) in your browser and copy the clone URL.

Then open the Git Bash, go to the directory which you want to clone the repository and type that command.

```
  $ git clone https://github.com/sneakysnakesfrc/sneaky-shuffleboard-2020.git
  ```

## GUI Highlights

First, let's have a quick look to the GUI : 

The first tab is Match Screen
![Match Screen](https://i.hizliresim.com/lQA4RQ.png)

As you can see in the first tab, there are some widgets, which will help to driver during the match. There is a camera stream which you can configure settings such as resolution or FPS, also a gyro widget, a FMS Information tab which you can see your robot's and driver station status, an alliance indicator which blinks as your alliance color, a voltage slider which you can see the voltage of the battery, and also an autonomous selector which will help you to choose the autonomous algorithm before the match starts.


And the second tab is Debugging Tab
![Debugging Tab](https://i.hizliresim.com/bvP9aj.png)
    
  As you can see in the debugging tab, there are some widgets, which will help you to debug your commands. There is a camera stream which you can configure settings such as resolution or FPS, also a PIDF tuning widget, an Encoder widget which you can choose and see the data coming from the sensor, a drivetrain graph which you can check the velocity of the motors, a PDP widget which you can see the current and voltage of the channels, also an autonomous selector which will help you to choose the autonomous algorithm.

## Code Highlights

- TurnPID command as a template, which you can customize the constant P,I,D,F parameters.
- NetworkTables base class, which you can just add more entries to put them to the table.
- Dashboard Updater, which is updating the dashboard every 20ms.


##
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)
[![Language: Java](https://img.shields.io/badge/Language-Java-ffa500.svg)](https://www.java.com/en/)
