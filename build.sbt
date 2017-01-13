lazy val root = (project in file(".")).
  enablePlugins(ScalaJSPlugin).
  settings(
    name := "opentok-scala",
    version := "1.0",
    scalaVersion := "2.11.8",
    skip in packageJSDependencies := false,
    libraryDependencies ++= Seq(
      "be.doeraene" %%% "scalajs-jquery" % "0.9.1"
    ),
    jsDependencies +=
      "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"
  )