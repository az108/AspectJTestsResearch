# AspectJ File System Interaction Project

This project demonstrates how to use AspectJ to intercept file system interactions in a Java application. 
The project includes aspects to monitor and control access to file read and write operations.
Less relevant after the Meeting are the Profiling classes as they block specific method calls.
Please focus on the Main Classes.

## Features

- Intercept method calls to `Files.write` and `FileOutputStream.write`.
- Log the parameters used in file operations.
- Control access based on predefined permissions for read, write, and execute operations.

