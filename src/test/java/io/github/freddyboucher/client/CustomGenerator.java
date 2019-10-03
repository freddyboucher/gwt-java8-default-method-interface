package io.github.freddyboucher.client;

import java.util.Arrays;

import javax.annotation.Nonnull;

import com.google.gwt.core.ext.Generator;
import com.google.gwt.core.ext.GeneratorContext;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.typeinfo.JAbstractMethod;
import com.google.gwt.core.ext.typeinfo.JClassType;

public class CustomGenerator extends Generator {

  @Override
  public final String generate(TreeLogger logger, GeneratorContext context, String typeName) throws UnableToCompleteException {
    JClassType genderType = context.getTypeOracle().findType(HasGender.class.getName());
    assert genderType.getMethods().length == 0;
    assert genderType.getInheritableMethods().length == 0;
    assert genderType.getOverridableMethods().length == 0;

    JClassType personType = context.getTypeOracle().findType(Person.class.getName());
    assert Arrays.equals(new String[] { "getName" }, Arrays.stream(personType.getMethods()).map(JAbstractMethod::getName).toArray());
    assert personType.getMethods()[0].isAnnotationPresent(Nonnull.class);

    String[] common = { "equals", "finalize", "getClass", "getName", "hashCode", "toString" };
    assert Arrays.equals(common, Arrays.stream(personType.getInheritableMethods()).map(JAbstractMethod::getName).toArray());
    assert Arrays.equals(common, Arrays.stream(personType.getOverridableMethods()).map(JAbstractMethod::getName).toArray());
    return null;
  }

}
