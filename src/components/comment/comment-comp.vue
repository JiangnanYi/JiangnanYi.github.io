<template>
        <div>
            <cinput @woyaobaocun="zhendeyaobaocuna"></cinput>
            <clist @shanchuwo="zhendeyaoshanchu" v-bind:comments="comments"></clist>
        </div>
</template>


<script>
import commentInput from './comment-input';
import commentList from './comment-list';
export default {
    data() { return {
        comments: []
    }},
    methods: {
        updateLocal() {
            localStorage.setItem('vvv-comments', JSON.stringify(this.comments));
        },
        zhendeyaobaocuna(res) {
            this.comments.push(res);
            this.updateLocal();
        },
        zhendeyaoshanchu(id) {
            this.comments = this.comments.filter((c) => c.id != id);
            this.updateLocal();
        }
    },
    components: {
        cinput: commentInput,
        clist: commentList
    },
    created() {
        const cs = localStorage.getItem('vvv-comments');
        if (cs) {
            this.comments = JSON.parse(cs);
        }
    }
}
</script>