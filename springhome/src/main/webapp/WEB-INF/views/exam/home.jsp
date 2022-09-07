<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<div id = "app">
<h1>성적 관리 프로그램</h1>
	
	<table class = "table table-border">
		<thead>
			<tr>
				<th>일련번호</th>
				<th>학생</th>
				<th>과목</th>
				<th>유형</th>
				<th>점수</th>
				<th>관리</th>
			</tr>
		</thead>
		<tbody>
			<tr v-for="(exam,index) in datalist" v-bind:key = "index" ;>
				<td>{{exam.examId}}</td>
				<td>{{exam.student}}</td>
				<td>{{exam.subject}}</td>
				<td>{{exam.type}}</td>
				<td>{{exam.score}}</td>
				<td>삭제</td>
			</tr>
		</tbody>
	</table>
</div>


<script src = "https://unpkg.com/vue@next"></script>
<script>
	const app = Vue.createApp({
		data(){
			return {
				dataList:[
					{examId:1,student:"테스트1",subject:"테스트",type:"서술형",socre:70},
					{examId:2,student:"테스트2",subject:"테스트",type:"서술형",socre:70},
					{examId:3,student:"테스트3",subject:"테스트",type:"서술형",socre:70},
					{examId:4,student:"테스트4",subject:"테스트",type:"서술형",socre:70},
					{examId:5,student:"테스트5",subject:"테스트",type:"서술형",socre:70},
					
				],
			};
		},
		computed:{
			
		},
		methods:{
			
		},
	});
	app.mount("#app");
</script>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>