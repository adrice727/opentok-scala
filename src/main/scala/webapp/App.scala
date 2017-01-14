package webapp

import scala.scalajs.js.JSApp
import scala.scalajs.js.Dynamic.global
import org.scalajs.jquery.jQuery

object App extends JSApp {
  val OT = global.OT
  def main(): Unit = {
    jQuery(setupUI _)
  }

  def setupUI(): Unit = {
    jQuery("#click-me-button").click(addClickedMessage _)
    jQuery("body").append("<p>Hello World</p>")
  }

  def appendPar(message: String): Unit = {
    jQuery("body").append(s"<p>$message</p>")
  }

  def addClickedMessage(): Unit = {
    appendPar("clicked on the thing")
  }
}