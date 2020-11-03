package demo;

import java.util.List;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.BodyDeclaration;

import gr.uom.java.xmi.UMLOperation;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UMLOperation targetMethod = null;
		String fileContent = "public class Demo{}";
		CompilationUnit cu = StaticJavaParser.parse(fileContent);
		List<BodyDeclaration> bodyDecls = cu.findAll(BodyDeclaration.class, 
				decl -> decl.getEnd().get().line < targetMethod.getLocationInfo().getEndLine());
	}

}
