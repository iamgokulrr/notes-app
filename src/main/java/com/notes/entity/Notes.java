package com.notes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_notes")
public class Notes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "notes_id")
	private long id;
	
	@Lob
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
}
