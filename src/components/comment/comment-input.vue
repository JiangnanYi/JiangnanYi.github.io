<template>
	<div class='cinput'>
		<label>
               <span>用户名:</span>
               <el-input v-model='author' placeholder="请输入内容"></el-input>
            </label>
		<label>
                <span>评论内容:</span>
                <el-input
				  type="textarea"
				  :autosize="{ minRows: 2, maxRows: 4}"
				  placeholder="请输入内容"
				  v-model="content">
				</el-input>
            </label>
		<footer>
			<el-button type="success" round @click='doSave'>发布</el-button>
		</footer>
	</div>
</template>

<script>
	var commentInput = {
	data(){
		return{
			author:'',
			content:''
		}
	},
	methods:{
		doSave(){
			if(!this.author){
				return alert('用户名不能为空');
			}
			if(!this.content){
				return alert('内容不能为空');
			}
			localStorage.setItem('vvv-authorname',this.author);
			this.$emit('woyaobaocun',{
				id:+new Date(),
				author:this.author,
				content:this.content
			});
			this.content = '';
		}
	},
	created(){
		const authorname =localStorage.getItem('vvv-auhorname');
		if(authorname){
			this.author = authorname;
		}
	}
};
export default commentInput;
</script>