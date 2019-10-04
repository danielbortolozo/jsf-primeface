package teste.junit;

import org.junit.Test;

import br.com.project.report.util.DateUtils;

public class testData {

	@Test
	public void test() {
		System.out.println(DateUtils.getDateAtualReportName());
	}

}
