package com.kh.spring08.entity;

public class ExamDto {

		private long examId;
		private String student, subject, type;
		private int score;
		@Override
		public String toString() {
			return "ExamDto [examId=" + examId + ", student=" + student + ", subject=" + subject + ", type=" + type
					+ ", score=" + score + "]";
		}
		public long getExamId() {
			return examId;
		}
		public void setExamId(long examId) {
			this.examId = examId;
		}
		public String getStudent() {
			return student;
		}
		public void setStudent(String student) {
			this.student = student;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public ExamDto() {
			super();
		}
	}

