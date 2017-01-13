package webapp

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport
import org.scalajs.jquery.jQuery
import org.scalajs.dom
import dom.document

object App extends JSApp {
  def main(): Unit = {
    println("hello there")
  }

  def appendPar(message: String): Unit = {
    jQuery("body").append(s"<p>$message</p>")
  }

  @JSExport
  def addClickedMessage(): Unit = {
    appendPar("foo bar")
  }
}