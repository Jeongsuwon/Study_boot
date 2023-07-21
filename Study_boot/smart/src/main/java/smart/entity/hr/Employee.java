package smart.entity.hr;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity(name="employees")
public class Employee {
	@Id @Column(name="employee_id") private Integer employeeId; //db와 다른 컬럼명 적을 때는 어떤 컬럼명인지 적어줘야 함
	private String last_name, first_name;
}
