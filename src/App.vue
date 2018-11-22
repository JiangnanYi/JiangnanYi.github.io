<template>
  <div id="app">
  	<div>
  	<center>
  		<h2>蛇皮聊天工具</h2>
  		<img src="./assets/logo.png">
  	</center>
  	<comment></comment>
  	</div>
      
  </div>
</template>

<script>
import Comment from './components/comment/comment-comp.vue'

export default {
  name: 'app',
  components: {
    Comment
  }
}
</script>

<style>
#app {
    width: 400px;
    padding: 2em;
    margin: 2em auto;
    border: 1px solid #e0e0e0;
    border-radius: 1em;
}
.cinput {
    margin-bottom: 1em;
}
label {
    display: flex;
    margin: 1em 0;
}
label span {
    flex-basis: 100px;
}
input, textarea {
    flex: 1;
}
.cinput footer {
    text-align: right;
}


.comment {
    padding: 1em;
    border-bottom: 1px solid #f0f0f0;
    display: flex;
}
.comment-author {
    color: steelblue;
    flex-basis: 80px;
}
.comment-delete {
    margin-left: auto;
}

</style>
