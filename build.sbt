val circeVersion = "0.8.0"
val circe = Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)


lazy val root = (project in file(".")).
  enablePlugins(ScalaJSPlugin).
  settings(
    name := "opentok-scala",
    version := "1.0",
    scalaVersion := "2.11.8",
    skip in packageJSDependencies := false,
    libraryDependencies ++= Seq(
      "be.doeraene" %%% "scalajs-jquery" % "0.9.1",
      "org.typelevel" %% "cats" % "0.9.0"
    ) ++ circe,
    jsDependencies ++= Seq(
      RuntimeDOM,
      "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"
    )
  )