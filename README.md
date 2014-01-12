# Giter8 Template for Scala.js

Based on the Scala.js [bootstrapping skeleton](https://github.com/sjrd/scala-js-example-app) and using a [forked version of "giter8"](https://github.com/sebnozzi/giter8) this template can be used to create cursom Scala.js projects.

In contrast to just cloning the [bootstrapping skeleton](https://github.com/sjrd/scala-js-example-app), using this "giter8" template allows you to easily get started with a custom project with:

* a custom **name**
* a custom **package structure**

It saves you the work of having to modify the HTML and JavaScript files to point to the correct names.

## Installation

### Removing previous "giter8" versions

WARNING: This template requires a [**forked** version of "giter8"](https://github.com/sebnozzi/giter8)!

If you have already installed "giter8", clean-up the "[conscript](https://github.com/n8han/conscript)" cache with:

```
cs --clean-boot
```

If you never installed "giter8" or "conscript" before, continue to the next section.

### Installing the "giter8" fork for Scala.js

First, you need to install "[conscript](https://github.com/n8han/conscript)".

Then, install the [forked giter8](https://github.com/sebnozzi/giter8) by running this on the command-line:

```
cs sebnozzi/giter8
```

This version supports a small formatting option which is needed for Scala.js, but not yet committer to the original "giter8" repository.

## Usage

### Creating Scala.js projects

From the command line, run:

```
g8 sebnozzi/scala-js.g8
```

After enter the requested information your project structure will be created.

You can now use Scala.js normally: `packageJS`, `test`, `optimizeJS` should all work. The HTML files should point to the correct JavaScript files.