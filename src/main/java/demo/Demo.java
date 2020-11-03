package demo;

import java.util.List;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.BodyDeclaration;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileContent = "public class Demo{}";
		CompilationUnit cu = StaticJavaParser.parse(fileContent);
		List<BodyDeclaration> bodyDecls = cu.findAll(BodyDeclaration.class, 
				decl -> decl.getEnd().get().line < 0);
	}

}
