<script setup>
import {
  VerticalNavLink,
  VerticalNavSectionTitle,
} from '@layouts'
</script>

<template>
    <ul>
        <VerticalNavSectionTitle :item="{ heading: 'Dashboard' }" />
        <VerticalNavLink
            :item="{
                title: 'Dashboard',
                to: '/dashboards',
            }"
        />
        <VerticalNavLink
            :item="{
                title: 'Dashboard',
                to: '/dashboards',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Drive' }" />
        <VerticalNavSectionTitle :item="{ heading: 'Indexer' }" />
        <VerticalNavSectionTitle :item="{ heading: 'VideoProcessing' }" />
        <VerticalNavSectionTitle :item="{ heading: 'Notification' }" />
    </ul>
</template>
