package ro.ase.cts.tests.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.tests.TestCaseGrupaFake;
import ro.ase.cts.tests.TestCasePromovabilitate;
import ro.ase.cts.tests.suite.categorii.TesteGetPromovabilitate;
import ro.ase.cts.tests.suite.categorii.TesteNormale;

@RunWith(Categories.class)
@SuiteClasses({ TestCasePromovabilitate.class, TestCaseGrupaFake.class})
@IncludeCategory(TesteGetPromovabilitate.class)
@ExcludeCategory({TesteNormale.class})
public class AllTestsCustom {

}
