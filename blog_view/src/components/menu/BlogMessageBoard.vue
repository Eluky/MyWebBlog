<template>
  <div>
    <blog-navbar></blog-navbar>
    <div style="width: 70%;margin: 0 auto;margin-top: 30px;background-color: white;padding-top: 20px;padding-bottom:10px;border-radius: 10px">
      <h1 style="border-bottom: mediumpurple 2px solid;color: mediumpurple;padding-bottom: 10px">留言栏</h1>
      <Form :model="formItem" :label-width="80" style="margin-top: 20px;margin-right: 50px;">
        <FormItem label="昵称" style="width: 250px">
          <Input v-model="formItem.name" placeholder="魔法名"></Input>
        </FormItem>
        <FormItem label="内容">
          <Input v-model="formItem.message" type="textarea" :autosize="{minRows: 5,maxRows: 10}" placeholder="说些什么吧～"></Input>
        </FormItem>
        <FormItem style="text-align: left">
          <Button @click="addMessage" shape="circle">留言</Button>
        </FormItem>
      </Form>
    </div>
    <br>
    <div v-for="(item, i) in listItem" style="width: 70%;margin: 0 auto;background-color: white;padding-top: 10px;padding-bottom:10px;border-radius: 2px;border: rebeccapurple 2px solid">
      <div style="text-align: left">
        <p style="font-size: 16px;margin-left: 20px"><b>{{item.name}}</b>:{{item.message}}</p>
      </div>
    </div>
    <blog-footer></blog-footer>
  </div>
</template>

<script>
    import blogFooter from '@/components/common/BlogFooter'
    import blogNavbar from '@/components/common/BlogNavbar'
    export default {
        name: 'BlogMessageBoard',
        components: {blogNavbar, blogFooter},
        data(){
            return{
                formItem: {
                    name: '',
                    message:''
                },
                listItem: [
                    {
                        name: '人间的小恶魔',
                        message: '你好吗'
                    },
                    {
                        name: '爱吃蛋黄酱的土方先生',
                        message: '天气不错'
                    }
                ]
            }
        },
        methods: {
            addMessage(){
                var name = this.formItem.name;
                var message = this.formItem.message;
                let date = new Date();
                let y = date.getFullYear();
                let MM = date.getMonth() + 1;
                MM = MM < 10 ? ('0' + MM) : MM;
                let d = date.getDate();
                d = d < 10 ? ('0' + d) : d;
                let h = date.getHours();
                h = h < 10 ? ('0' + h) : h;
                let m = date.getMinutes();
                m = m < 10 ? ('0' + m) : m;
                let s = date.getSeconds();
                s = s < 10 ? ('0' + s) : s;
                var time =  y + '-' + MM + '-' + d + ' ' + h + ':' + m + ':' + s;
                if(!name){
                    this.$Message.warning("输入不能为空哦")
                }else if(!message){
                    this.$Message.warning("输入不能为空哦")
                }else{
                    this.$axios
                        .post('/message/addMessage',
                            {
                                nickname: name,
                                message: message,
                                time: time,
                                like: 0
                            }).then(res => {
                                if (res.data.code === 200){
                                    this.$Message.success("留言成功～")
                                }
                    })

                }
            }
        }
    }

</script>

<style scoped>
  >>>.ivu-btn:hover{
    color: mediumpurple;
    border-color: mediumpurple;
  }
  >>>.ivu-input:focus {
    box-shadow: none;
    border-color: mediumpurple;
  }
  >>>.ivu-input:hover {
    box-shadow: none;
    border-color: mediumpurple;
  }
</style>
