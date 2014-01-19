# Giter8 Template for Scala.js

Using this "giter8" template  you can easily generate a Scala.js project where this is set-up automatically for you:

* a custom **name**
* a custom **package structure**

It saves you the work of having to [manually update](http://www.sebnozzi.com/142/scala-js-custom-names/) the directory structure, Scala classes, HTML and JavaScript files.

## Installation

### Upgrading: Removing previous "giter8" versions

Your "giter8" version must be from the 17th January 2014 or newer.

If you never installed "giter8" or "conscript" before, skip to the next section.

If you have not upgraded in a while, clean-up the "[conscript](https://github.com/n8han/conscript)" cache with:

```
cs --clean-boot
```

Afterwards, re-install "giter8".

### Installing "giter8"

Follow the [installation instructions](https://github.com/n8han/giter8#installation) found on the official "giter8" page.

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