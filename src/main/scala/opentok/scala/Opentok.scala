package opentok.scala

import scala.scalajs.js.Dynamic.global
import java.io.InputStream
import io.circe._, io.circe.generic.semiauto._, io.circe.parser._
import cats.syntax.either._

case class OpentokCredentials(apiKey: String, sessionId: String, token: String)

object Opentok {
  private val credentialsJSON: String = {
    val stream: InputStream = getClass.getResourceAsStream("/opentokCredentials.json")
    scala.io.Source.fromInputStream(stream).mkString
  }
  implicit val credentialsDecoder: Decoder[OpentokCredentials] = deriveDecoder[OpentokCredentials]
  private val credentials: OpentokCredentials = decode[OpentokCredentials](credentialsJSON).getOrElse(null)
  val OT = global.OT

  def init(): Unit = {
    val session = OT.initSession(credentials.apiKey, credentials.sessionId)
    println(session)
    session.connect(credentials.token)
  }

  //
  //  def connect(): Unit = session.connect()
  //  def startCall(): Unit =  session.publish()
}