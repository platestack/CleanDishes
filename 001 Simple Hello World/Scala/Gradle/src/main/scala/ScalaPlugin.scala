package com.example.platestack

import org.platestack.api.plugin.PlatePlugin
import org.platestack.api.plugin.annotation.{Plate, Version, Requires, Library}

@Plate(id = "scala_gradle_plugin", name = "My Scala Gradle Plugin", version = new Version("0.1.0-SNAPSHOT"))
@Requires(Array(new Library(group = "org.scala-lang", artifact = "scala-library", version = "2.12.2")))
object ScalaPlugin extends PlatePlugin {

  override def onEnable() {
    getLogger.info { s"Hello World from ${getMetadata.getName} version $getVersion" }
  }

}
