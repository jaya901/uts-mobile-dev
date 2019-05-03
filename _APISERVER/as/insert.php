<?php
require_once 'koneksi.php';
if($_SERVER['REQUEST_METHOD'] == 'POST'){
    $nama = $_POST['nama'];
    $jenis = $_POST['jenis'];
    $stok = $_POST['stok'];

    $query = "INSERT INTO laptop (nama, jenis, stok) VALUES ('$nama','$jenis','$stok')";
    $exeQuery = mysqli_query($kon, $query);
    
    echo ($exeQuery) ? json_encode(array('kode' =>1, 'pesan' => 'berhasil menambahkan data')) : json_encode(array('kode' =>2, 'pesan' => 'data gagal ditambahkan'));
}else{
    echo json_encode(array('kode' =>101, 'pesan' => 'request tidak valid'));
}
?>