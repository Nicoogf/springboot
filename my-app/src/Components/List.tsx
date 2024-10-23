interface Props {
  subs: Array<{
    nick: string
    subMonts: number
    avatar: string
    desc?: string
  }>
}

const ListUsers = ({ subs }: Props) => {
  return (
    <ul>
      {subs.map(sub => (
        <li key={sub.nick}>
          <img src={sub.avatar} alt={`avatar de ${sub.nick}`} />
          <p> {sub.nick} (<small> {sub.subMonts}  </small>) </p>
          <p> {sub.desc?.substring(0, 100)}</p>
        </li>
      ))}
    </ul>
  )
}
export default ListUsers;

