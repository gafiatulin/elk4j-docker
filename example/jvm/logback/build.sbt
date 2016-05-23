name := "logback"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture",
  "-Ywarn-unused-import"
)

libraryDependencies ++= Seq(
  "ch.qos.logback"       % "logback-classic"          % "1.1.7",
  "net.logstash.logback" % "logstash-logback-encoder" % "4.7",
  "org.codehaus.janino"  % "janino"                   % "2.7.8"
)

assemblyOutputPath in assembly := target.value / "service.jar"