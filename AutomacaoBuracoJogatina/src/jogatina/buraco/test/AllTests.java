package jogatina.buraco.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//Classe criada a fim de rodar os testes de uma só vez.
@RunWith(Suite.class)
@SuiteClasses({ ValidaTelaInicialHomeENTest.class,
		ValidaTelaInicialHomePTTest.class })
public class AllTests {

}
