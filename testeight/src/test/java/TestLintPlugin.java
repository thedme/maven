

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import schemacrawler.tools.lint.LinterRegistry;

public class TestLintPlugin
{

  @Test
  public void testLintPlugin()
    throws Exception
  {
    final LinterRegistry registry = new LinterRegistry();
    assertTrue(registry.hasLinter("com.testeight.AdditionalLinter"));
  }

}
