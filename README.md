# Giter8 Template for Scala.js

Using this "giter8" template  you can easily generate a Scala.js project where this is set-up automatically for you:

* a custom **name**
* a custom **package structure**

It saves you the work of having to [manually update](http://www.sebnozzi.com/142/scala-js-custom-names/) the directory structure, Scala classes, HTML and JavaScript files.

## Installation

### Installing "giter8"

To install "giter8" for the first time, follow the [installation instructions](https://github.com/n8han/giter8#installation) on the official "giter8" page.

If you _already_ have "giter8" installed, but it's from before **17th Jan 2014**, you need to **upgrade** (if in doubt, upgrade).

First, clean-up the "[conscript](https://github.com/n8han/conscript)" cache with:

```
cs --clean-boot
```

Afterwards, re-install "giter8" with:

```
cs n8han/giter8
```

## Usage

### Creating Scala.js projects

From the command line, run:

```
g8 sebnozzi/scala-js.g8
```

You will be asked for:

1. Version,
1. Organization and
1. Name

of your project. 

Sample session:

```
# g8 sebnozzi/scala-js.g8

Scala.js Project 

version [0.1-SNAPSHOT]:
organization [org.example]: com.sebnozzi
name [ScalaJS Example]: My Cool Project

Template applied in ./my-cool-project
```

After enter the requested information your project structure will be created (note that in the example above the version was left blank and thus default value was taken).

You can now use you Scala.js project as expected: `packageJS`, `test`, `optimizeJS` should all work.