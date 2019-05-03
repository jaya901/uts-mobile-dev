<?php
require_once 'koneksi.php';
if($_SERVER['REQUEST_METHOD'] == 'POST')
{
    $id = $_POST['id'];
    $nama = $_POST['nama'];
    $jenis = $_POST['jenis'];
    $stok = $_POST['stok'];
    $query = "UPDATE laptop SET nama = '$nama',jenis = '$jenis', stok = '$stok' WHERE id='$id'";
    $exeQuery = mysqli_query($kon, $query);
    echo ($exeQuery) ? json_encode(array('kode' =>1, 'pesan' => 'data berhasil update')) : json_encode(array('kode' =>2, 'pesan' => 'data gagal diupdate'));
}else{
    echo json_encode(array('kode' =>101, 'pesan' => 'request tidak valid'));
}
?>