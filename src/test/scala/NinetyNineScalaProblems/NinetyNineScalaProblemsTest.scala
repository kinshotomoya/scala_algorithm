package NinetyNineScalaProblems

import org.scalatest.FunSpec

class NinetyNineScalaProblemsTest extends FunSpec{

  describe("NNP14") {
    it("should be duplicate") {
      // given
      val list = List('a, 'b, 'c, 'c, 'd)
      // when
      val actual = NNP.duplicate(list)
      // then
      val expected =  List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
      assert(actual == expected)
    }
  }

  describe("NNP15") {
    it("should be duplicateN") {
      // given
      val number = 3
      val list = List('a, 'b, 'c, 'c, 'd)
      // when
      val actual = NNP.duplicateN(number, list)
      // then
      val expected =  List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
      assert(actual == expected)
    }
  }

  describe("NNP16") {
    it("should be drop") {
      // given
      val number = 3
      val list =  List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
      // when
      val actual = NNP.drop(number, list)
      // then
      val expected = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
      assert(actual == expected)
    }
  }
}
