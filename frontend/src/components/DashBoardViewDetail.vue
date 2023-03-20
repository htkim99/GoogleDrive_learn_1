<template>

    <v-card outlined>
        <v-card-title>
            DashBoard # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="Name" v-model="item.name" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="Size" v-model="item.size" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Path" v-model="item.path" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Type" v-model="item.type" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="Isindexed" v-model="item.isindexed" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="Isuploaded" v-model="item.isuploaded" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Url" v-model="item.url" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'DashBoardViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/dashBoards/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

