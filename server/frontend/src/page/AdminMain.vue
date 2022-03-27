<template>
  
<div>
    <el-container>
        <el-header>
            <h2>
                Transfer Tool
            </h2>
        </el-header>
        <el-container>
            <el-aside width="200px">Aside</el-aside>
            <el-container>
                <el-main>

                    <router-view />
                    
                </el-main>
                <el-footer>Footer</el-footer>
            </el-container>
        </el-container>
    </el-container>
</div>
</template>

<script>
export default {

}
</script>

<style>

</style>