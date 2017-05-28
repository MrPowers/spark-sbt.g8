package $organization$.$name$

import org.scalatest.FunSpec

class MannersSpec extends FunSpec {

  describe(".beNice") {

    it("tells you how to treat your mother") {
      assert(Fun.beNice() === "Be nice to your mother!")
    }

  }

}