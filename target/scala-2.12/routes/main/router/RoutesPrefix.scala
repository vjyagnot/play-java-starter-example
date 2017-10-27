
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vj/playstarter/conf/routes
// @DATE:Tue Oct 24 01:23:38 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
