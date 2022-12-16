package schoolcodigo.com.schoolcodigo.entity;



import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RelatorioDiario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDate data;

	@Column(nullable = false)
	private String texto;

	@Column(nullable = false)
	private String inspetor;

	public void setInspetor(String inspetor) {
		this.inspetor = inspetor;
		
	}

	public void setTexto(String texto) {
		this.texto = texto;
		
	}

	public String getTexto() {
		return this.texto;
	}
}
