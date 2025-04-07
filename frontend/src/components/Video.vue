<template>
    <div>
        <Number
            label="FileId"
            v-model="value.fileId"
            :editMode="editMode"
        />
        <String
            label="Url"
            v-model="value.url"
            :editMode="editMode"
        />
        <v-row class="ma-0 pa-0">
            <v-spacer></v-spacer>
            <v-btn width="64px" color="primary" @click="save">
                저장
            </v-btn>
        </v-row>
    </div>
</template>


<script>
import BaseEntity from './base-ui/BaseEntity.vue'

export default {
    name: 'Video',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "videos",
        value: {
        }
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
