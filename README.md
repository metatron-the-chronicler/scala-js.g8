# Giter8 Template for Scala.js

In contrast to just cloning the [bootstrapping skeleton](https://github.com/sjrd/scala-js-example-app), using this "giter8" template allows you to easily create a Scala.js project with:

* a custom **name**
* a custom **package structure**

It saves you the work of having to [manually change](http://www.sebnozzi.com/142/scala-js-custom-names/) the directory structure, Scala classes, HTML and JavaScript.

## Installation

WARNING: This template requires a [**forked** version of "giter8"](https://github.com/sebnozzi/giter8)!

### Removing previous "giter8" versions

If you have already installed "giter8", clean-up the "[conscript](https://github.com/n8han/conscript)" cache with:

```
cs --clean-boot
```

If you never installed "giter8" or "conscript" before, continue to the next section.

### Installing the **forked** version of "giter8" for Scala.js

First, you need to install "[conscript](https://github.com/n8han/conscript)".

Then, install the [forked giter8](https://github.com/sebnozzi/giter8) by running this on the command-line:

```
cs sebnozzi/giter8
```

It is important that you install `sebnozzi/giter8` and NOT `n8han/giter8`.

This version supports a small but important formatting option which is needed for Scala.js, but not yet committed to the original "giter8" repository.

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

of your project. Sample session:

```
Scala.js Project 

version [0.1-SNAPSHOT]:
organization [org.example]: com.sebnozzi
name [ScalaJS Example]: My Cool Project
```

After enter the requested information your project structure will be created (note that the version was left blank and the default value was taken).

You can now use Scala.js normally: `packageJS`, `test`, `optimizeJS` should all work. The HTML files should point to the correct JavaScript files.