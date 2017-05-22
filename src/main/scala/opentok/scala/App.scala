package opentok.scala
import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery
import scala.scalajs.js.Dynamic.global


object App extends JSApp {
  def main(): Unit = {
    jQuery(setupUI _)

  }

  def setupUI(): Unit = {
    Opentok.init()
//    jQuery("#click-me-button").click(Opentok.startCall())
  }

  def appendPar(message: String): Unit = {
    jQuery("body").append(s"<p>$message</p>")
  }

  def addClickedMessage(): Unit = {
    appendPar("clicked on the thing")
  }
}