name := "kafkaStreams-scala"

version := "0.1"

scalaVersion := "2.12.4"

val kafkaVersion = "1.1.1"

libraryDependencies ++= Seq(
  "org.apache.kafka" % "kafka-streams" % kafkaVersion,
  "org.apache.kafka" % "kafka-clients" % kafkaVersion,
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0",
  "commons-lang" % "commons-lang" % "2.6"
)