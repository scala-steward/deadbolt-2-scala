// Comment to get more information during initialization
logLevel := Level.Warn

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % Option(System.getProperty("play.version")).getOrElse("2.9.0"))

addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.12")
