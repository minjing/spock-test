package test

import spock.lang.Specification

class AnnotationMetaTest extends Specification {

  def 'Test createInstance'() {
    def mockTest = Mock(AnnotationMeta.Builder1)

    when:
    mockTest.getInstance()

    then:
    true == true
  }
}
