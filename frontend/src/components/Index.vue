<template>
    <div>
        <Number
            label="FileId"
            v-model="value.fileId"
            :editMode="editMode"
        />
        <v-divider class="border-opacity-50 my-divider my-2"></v-divider>
        <div variant="outlined" class="my-2">
            <String
                label="Keyword"
                v-model="keywordInput"
                :editMode="editMode"
                @keydown.enter="addKeywordList"
            />
            <v-card v-if="value.keyword.length > 0" variant="outlined" class="pa-4 mt-2">
                <v-card-sub-title>
                    Keyword List
                </v-card-sub-title>
                <li v-for="(name, index) in value.keyword" :key="index">
                    {{ name }}
                </li>
            </v-card>
            <v-row class="ma-0 pa-0 mt-2">
                <v-spacer></v-spacer>
                <v-btn @click="addKeywordList">
                    Keyword 추가
                </v-btn>
            </v-row>
            
            <StringDetailGrid
                label="Keyword"
                offline
                v-model="value.keyword"
                :editMode="editMode"
                @change="change"
            />
        </div>
        <v-divider class="border-opacity-50 my-divider my-2"></v-divider>
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
    name: 'Index',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "indices",
        keywordInput: null,
        value: {
            keyword: [],
        }
    }),
    created(){
    },
    computed:{
    },
    methods: {
        addKeywordList() {
            if (this.keywordInput !== null && this.keywordInput !== '') {
                this.value.keyword.push(this.keywordInput);
                this.keywordInput = null; // null로 초기화
            }
        },
    },
}
</script>
