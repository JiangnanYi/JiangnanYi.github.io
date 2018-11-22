<template>
	<el-row type="flex" class="row-bg" justify="space-around">
  <el-col :span="6"><div class="grid-content bg-purple"><span class='comment-author'>{{comment.author}}:</span></div></el-col>
  <el-col :span="6"><div class="grid-content bg-purple-light"></div><span class='comment-content'>{{comment.content}}</span></el-col>
  <el-col :span="6"><div class="grid-content bg-purple"><i href @click.prevent='deleteMe' class="el-icon-delete" style="margin-right: 200px;"></i></div></el-col>
</el-row>
</template>
<script>
	export default {
		props: ['comment'],
		methods: {
			deleteMe() {
				this.$emit('shanchuwo', this.comment.id);
			}
		}
	};
</script>