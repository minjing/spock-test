package test;

public class AnnotationMeta {
  public static class Builder1 extends Builder<String> {

    @Override
    protected String createInstance() {
      return "Hello";
    }
  }
}
