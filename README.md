# Giter8 Template for Scala.js

What is [giter8](https://github.com/n8han/giter8)?

> "Giter8 is a command line tool to generate files and directories from templates published on github or any other git repository"

Using this giter8 template  you can easily generate a [Scala.js](http://www.scala-js.org/) project where this is set-up automatically for you:

* a custom **name**
* a custom **package structure**

It saves you the work of having to [manually update](http://www.sebnozzi.com/142/scala-js-custom-names/) the directory structure, Scala classes, HTML and JavaScript files.

## Installation

### Installing giter8

To install giter8 for the first time, follow the [installation instructions](https://github.com/n8han/giter8#installation) on the official page.

If you _already_ have giter8 installed, but it's from before **30th June 2014**, you need to **upgrade** (if in doubt, upgrade).

First, clean-up the [conscript](https://github.com/n8han/conscript) cache with:

```
cs --clean-boot
```

Afterwards, re-install giter8 with:

```
cs n8han/giter8
```

## Usage

### Creating Scala.js projects

From the command line, run:

```
g8 sebnozzi/scala-js.g8
```

(Note how this schema points to this project on github)

You will be asked for:

1. Version,
1. Organization,
1. Name,
1. Package Name (simply accept the default value as it is derived from the previously entered Organization and Name) and
1. Class Name (simply accept the default value as it is derived from the previously entered Name)

of your project.

After enter the requested information your project structure will be created (note that in the example above the version was left blank and thus default value was taken).

Sample session:

```
# g8 sebnozzi/scala-js.g8

Scala.js Project

name [ScalaJS Example]: ScalaJsDemo
organization [org.example]: 
version [0.1-SNAPSHOT]: 
packageName [org.example.scalajsdemo]: 
className [Scalajsdemo]: 

Template applied in ./scalajsdemo

# cd scalajsdemo
# sbt
```

You can now use you Scala.js project as expected: `test`, `fastOptJS`, `fullOptJS` should all work from SBT.
