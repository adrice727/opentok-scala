package opentok.scala

import scala.scalajs.js.Dynamic.global

object Opentok {
  val OT = global.OT
  def init(): Unit = {
    val session = OT.initSession(opentokCredentials("apiKey"), opentokCredentials("sessionId"))
    println(session)
    session.connect(opentokCredentials("token"))
  }

//
//  def connect(): Unit = session.connect()
//  def startCall(): Unit =  session.publish()
}